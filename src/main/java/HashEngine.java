import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * HashEngine 클래스
 * 
 * 역할: SHA-256 알고리즘으로 파일의 해시값을 생성하는 클래스
 * - MessageDigest를 사용한 해시 생성
 * - BufferedInputStream으로 대용량 파일 효율적 처리
 * - 바이트 데이터를 16진수 문자열로 변환
 */
public class HashEngine {
    
    // 버퍼 크기 상수 (8KB - 대용량 파일 처리에 적합)
    private static final int BUFFER_SIZE = 8192;
    
    /**
     * 주어진 파일의 SHA-256 해시값을 계산하여 반환하는 메소드
     * 
     * @param filePath 해시값을 계산할 파일의 경로
     * @return 계산된 SHA-256 해시값 (16진수 문자열)
     * @throws IOException 파일 읽기 실패
     * @throws NoSuchAlgorithmException SHA-256 알고리즘 미지원
     */
    public String calculateHash(String filePath) throws IOException, NoSuchAlgorithmException {
        // 1. MessageDigest.getInstance("SHA-256")로 해시 객체 생성
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        
        // 2. BufferedInputStream으로 파일을 읽음 (try-with-resources로 자동 자원 해제)
        try (FileInputStream fis = new FileInputStream(filePath);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            
            // 3. 읽은 바이트를 해시 객체에 업데이트 (파일 끝까지 반복)
            while ((bytesRead = bis.read(buffer)) != -1) {
                digest.update(buffer, 0, bytesRead);
            }
        }
        
        // 4. 최종 해시값을 바이트 배열로 얻음
        byte[] hashBytes = digest.digest();
        
        // 5. 바이트 배열을 16진수 문자열로 변환
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            // 바이트를 부호 없는 정수로 변환 (0xff & b) 후 16진수 문자열로 변환
            String hex = Integer.toHexString(0xff & b);
            
            // 한 자리 16진수는 앞에 '0'을 붙여 두 자리로 맞춤
            // (예: 0x0a → "a"가 아닌 "0a"로 통일)
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        
        // 6. 결과 문자열 반환
        return hexString.toString();
    }
}
