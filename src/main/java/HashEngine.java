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
    
    /**
     * 주어진 파일의 SHA-256 해시값을 계산하여 반환하는 메소드
     * 
     * @param filePath 해시값을 계산할 파일의 경로
     * @return 계산된 SHA-256 해시값 (16진수 문자열)
     * @throws IOException 파일 읽기 실패
     * @throws NoSuchAlgorithmException SHA-256 알고리즘 미지원
     */
    public String calculateHash(String filePath) throws IOException, NoSuchAlgorithmException {
        // TODO: 구현할 메소드
        // 1. MessageDigest.getInstance("SHA-256") 로 해시 객체 생성
        // 2. BufferedInputStream으로 파일을 읽음 (버퍼링 처리)
        // 3. 읽은 바이트를 해시 객체에 업데이트
        // 4. 최종 해시값을 바이트 배열로 얻음
        // 5. 바이트 배열을 Integer.toHexString()을 사용해 16진수 문자열로 변환
        // 6. 결과 문자열 반환
        return null;
    }
}
