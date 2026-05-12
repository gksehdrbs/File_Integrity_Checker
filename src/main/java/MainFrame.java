import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

/**
 * MainFrame 클래스
 * 
 * 역할: JFrame 기반의 GUI 메인 윈도우
 * - JList로 등록된 파일 목록 시각화
 * - JFileChooser로 파일 등록 / 삭제 인터페이스 제공
 * - 버튼 이벤트 처리 및 결과 팝업 출력
 */
public class MainFrame extends JFrame {
    
    private FileManager fileManager;           // 파일 목록 관리
    private IntegrityChecker integrityChecker; // 무결성 검증
    
    private JList<String> fileListDisplay;     // 파일 목록을 표시하는 JList
    private DefaultListModel<String> listModel; // JList의 데이터 모델
    
    private JButton addButton;                  // 파일 등록 버튼
    private JButton removeButton;               // 파일 삭제 버튼
    private JButton checkButton;                // 무결성 검증 버튼
    
    /**
     * MainFrame 생성자
     * 
     * @param fileManager 파일 관리자 인스턴스
     * @param integrityChecker 무결성 검사기 인스턴스
     */
    public MainFrame(FileManager fileManager, IntegrityChecker integrityChecker) {
        // TODO: 구현할 생성자
        // 1. JFrame 기본 설정 (제목, 크기, 닫기 옵션 등)
        // 2. this.fileManager = fileManager
        // 3. this.integrityChecker = integrityChecker
        // 4. initComponents() 호출
        // 5. setVisible(true)
    }
    
    /**
     * GUI 컴포넌트 초기화 메소드
     */
    private void initComponents() {
        // TODO: 구현할 메소드
        // 1. Container 획득 및 레이아웃 설정
        // 2. DefaultListModel 생성 및 JList 생성
        // 3. 파일 목록 새로고침 (updateFileList() 호출)
        // 4. 추가/삭제/검증 버튼 생성
        // 5. 각 버튼에 ActionListener 등록:
        //    - 추가: addFileAction()
        //    - 삭제: removeFileAction()
        //    - 검증: checkFileAction()
        // 6. 컴포넌트들을 패널에 배치
        // 7. JFrame에 패널 추가
    }
    
    /**
     * 파일 목록을 JList에 다시 로드하는 메소드
     * 파일 추가/삭제 후 호출되어 화면 업데이트
     */
    private void updateFileList() {
        // TODO: 구현할 메소드
        // 1. listModel.clear()로 기존 항목 제거
        // 2. fileManager.getAllFiles()로 최신 목록 획득
        // 3. 각 FileItem에 대해:
        //    - 파일명, 상태 등 필요한 정보를 문자열로 포맷
        //    - listModel.addElement()로 추가
    }
    
    /**
     * 파일 추가 버튼 클릭 이벤트 처리
     */
    private void addFileAction() {
        // TODO: 구현할 메소드
        // 1. JFileChooser 생성
        // 2. showOpenDialog(this) 호출
        // 3. 사용자가 파일 선택 시:
        //    - 선택된 파일 경로와 파일명 획득
        //    - HashEngine을 이용해 해시값 계산 (박주현 지원)
        //    - FileItem 생성
        //    - fileManager.addFile(fileItem) 호출
        //    - updateFileList() 호출
        //    - JOptionPane으로 성공 메시지 팝업
        // 4. 예외 발생 시 JOptionPane으로 오류 메시지 팝업
    }
    
    /**
     * 파일 삭제 버튼 클릭 이벤트 처리
     */
    private void removeFileAction() {
        // TODO: 구현할 메소드
        // 1. JList에서 선택된 항목 확인
        // 2. 선택된 파일의 경로 획득
        // 3. fileManager.removeFile(경로) 호출
        // 4. updateFileList() 호출
        // 5. JOptionPane으로 삭제 완료 메시지 팝업
    }
    
    /**
     * 무결성 검증 버튼 클릭 이벤트 처리
     */
    private void checkFileAction() {
        // TODO: 구현할 메소드
        // 1. JList에서 선택된 항목의 FileItem 획득
        // 2. integrityChecker.checkIntegrity(fileItem) 호출
        // 3. 반환된 상태에 따라 JOptionPane으로 결과 팝업:
        //    - "정상": 초록색 배경 + "파일이 정상입니다" 메시지
        //    - "변조됨": 빨간색 배경 + "파일이 변조되었습니다" 메시지
        //    - "파일없음": 노란색 배경 + "파일이 없습니다" 메시지
        //    - "오류": 회색 배경 + "검사 중 오류가 발생했습니다" 메시지
        // 4. updateFileList() 호출 (상태 갱신)
    }
}
