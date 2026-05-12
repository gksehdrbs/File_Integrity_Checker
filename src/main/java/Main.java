public class Main {
    
    /**
     * 애플리케이션 메인 메소드
     * 
     * @param args 명령행 인수
     */
    public static void main(String[] args) {
        // 1. 데이터 저장 설정 파일 경로 정의
        String configFilePath = "fileData.txt";  // 프로젝트 루트에 저장될 파일
        
        // 2. FileManager 초기화 (기존 데이터 자동 로드)
        FileManager fileManager = new FileManager(configFilePath);
        
        // 3. HashEngine 생성 (파일 해시값 계산용)
        HashEngine hashEngine = new HashEngine();
        
        // 4. IntegrityChecker 생성 (무결성 검증용)
        IntegrityChecker integrityChecker = new IntegrityChecker(hashEngine);
        
        // 5. GUI 메인 윈도우 실행
        MainFrame mainFrame = new MainFrame(fileManager, integrityChecker);
        
        System.out.println("파일 무결성 검사 시스템이 시작되었습니다.");
    }
}
