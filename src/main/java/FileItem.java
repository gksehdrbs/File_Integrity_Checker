// 기본적인 객체 틀입니다.

import java.io.Serializable;

 // 각 파일의 고유 정보와 해시값을 담는 객체입니다.
public class FileItem implements Serializable {
    
    // 객체 직렬화를 위한 고유 ID (파일 입출력 시 버전 충돌 방지)
    private static final long serialVersionUID = 1L;

    // 1. 파일 기본 정보
    private String fileName;      // 파일명 (예: report.docx)
    private String filePath;      // 파일 절대 경로 (예: C:\Docs\report.docx)
    
    // 2. 보안(해시) 정보
    private String storedHash;    // 기존에 저장되어 있던 기준 해시값
    private String currentHash;   // 검사 시점에 실시간으로 계산한 현재 해시값
    
    // 3. 상태 정보
    private String status;        // 현재 상태 (예: "대기중", "정상", "변조됨", "파일없음")

    // 처음 파일을 리스트에 등록할 때 사용합니다.
    public FileItem(String fileName, String filePath, String hash) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.storedHash = hash;
        this.currentHash = hash; // 처음엔 기존 값과 현재 값이 동일함
        this.status = "대기중";
    }

    // Getter & Setter (다른 클래스에서 데이터 접근 시 사용)
    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getStoredHash() {
        return storedHash;
    }

    public void setStoredHash(String storedHash) {
        this.storedHash = storedHash;
    }

    public String getCurrentHash() {
        return currentHash;
    }

    public void setCurrentHash(String currentHash) {
        this.currentHash = currentHash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        // 구분자(|)를 두어 나중에 다시 읽어올 때 split("\\|")로 쉽게 쪼갤 수 있게 함
        return fileName + "|" + filePath + "|" + storedHash;
    }
}