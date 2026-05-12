import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.io.FileNotFoundException;

/**
 * IntegrityChecker 클래스
 * 
 * 역할: 현재 파일 해시값을 계산하고 저장된 해시값과 비교하여 무결성을 판별하는 클래스
 * - HashEngine을 호출해 현재 해시값 계산
 * - FileItem의 저장값과 비교
 * - 상태 업데이트 (정상/변조/파일없음 등)
 */
public class IntegrityChecker {
    
    private HashEngine hashEngine;  // 해시값 계산을 위한 HashEngine 인스턴스
    
    /**
     * IntegrityChecker 생성자
     * 
     * @param hashEngine 해시값을 계산할 HashEngine 인스턴스
     */
    public IntegrityChecker(HashEngine hashEngine) {
        // TODO: 구현할 생성자
        // this.hashEngine = hashEngine으로 초기화
    }
    
    /**
     * 주어진 FileItem의 무결성을 검증하는 메소드
     * 
     * @param fileItem 검증할 FileItem 객체
     * @return 검증 결과 상태 문자열 ("정상", "변조됨", "파일없음" 등)
     */
    public String checkIntegrity(FileItem fileItem) {
        // TODO: 구현할 메소드
        // 1. try-catch로 예외 처리
        // 2. HashEngine.calculateHash(파일경로)로 현재 해시값 계산
        // 3. fileItem.setCurrentHash(현재해시값)으로 업데이트
        // 4. fileItem.getStoredHash()와 비교
        // 5. 일치 여부에 따라 상태 설정:
        //    - 일치: "정상"
        //    - 불일치: "변조됨"
        // 6. catch (FileNotFoundException): "파일없음"
        // 7. catch (IOException, NoSuchAlgorithmException): "오류"
        // 8. fileItem.setStatus()로 상태 저장
        // 9. 상태 문자열 반환
        return null;
    }
    
    /**
     * 모든 FileItem에 대해 무결성을 검증하는 메소드
     * 
     * @param fileList 검증할 FileItem 목록
     * @return 각 파일의 검증 결과를 담은 배열
     */
    public String[] checkAllIntegrity(FileItem[] fileList) {
        // TODO: 구현할 메소드
        // 1. fileList 크기만큼 String 배열 생성
        // 2. 반복문으로 각 FileItem에 대해 checkIntegrity() 호출
        // 3. 결과를 배열에 저장
        // 4. 배열 반환
        return null;
    }
}
