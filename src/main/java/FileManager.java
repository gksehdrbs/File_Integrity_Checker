import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 * FileManager 클래스
 * 
 * 역할: FileItem 목록을 관리하고 .txt 파일로 데이터를 저장·불러오는 클래스
 * - ArrayList로 FileItem 목록 관리
 * - HashMap으로 파일 경로를 키(Key)로 사용해 빠른 검색 최적화
 * - Scanner/PrintWriter로 .txt 파일에 데이터 영속성 구현
 */
public class FileManager {
    
    private ArrayList<FileItem> fileList;        // 등록된 파일들의 목록
    private HashMap<String, FileItem> fileMap;   // 파일 경로를 키로 하는 빠른 검색용 맵
    private String configFilePath;               // 데이터를 저장할 .txt 설정 파일 경로
    
    /**
     * FileManager 생성자
     * 
     * @param configFilePath 데이터를 저장/불러올 .txt 파일의 경로
     */
    public FileManager(String configFilePath) {
        // TODO: 구현할 생성자
        // 1. ArrayList<FileItem> 초기화
        // 2. HashMap<String, FileItem> 초기화
        // 3. configFilePath 저장
        // 4. loadFromFile() 호출하여 기존 데이터 자동 로드
    }
    
    /**
     * 새로운 파일을 목록에 등록하는 메소드
     * 
     * @param fileItem 추가할 FileItem 객체
     */
    public void addFile(FileItem fileItem) {
        // TODO: 구현할 메소드
        // 1. fileList에 FileItem 추가
        // 2. fileMap에도 등록 (키: 파일 경로, 값: FileItem)
        // 3. saveToFile() 호출하여 파일에 즉시 저장
    }
    
    /**
     * 파일을 목록에서 삭제하는 메소드
     * 
     * @param filePath 삭제할 파일의 경로
     */
    public void removeFile(String filePath) {
        // TODO: 구현할 메소드
        // 1. fileMap에서 해당 파일 경로의 FileItem 삭제
        // 2. fileList에서도 제거
        // 3. saveToFile() 호출하여 파일에 즉시 저장
    }
    
    /**
     * 파일 경로로 FileItem을 조회하는 메소드
     * 
     * @param filePath 조회할 파일의 경로
     * @return 해당하는 FileItem, 없으면 null
     */
    public FileItem getFile(String filePath) {
        // TODO: 구현할 메소드
        // fileMap.get(filePath)로 빠르게 조회
        return null;
    }
    
    /**
     * 전체 파일 목록을 반환하는 메소드
     * 
     * @return 등록된 모든 FileItem의 ArrayList 복사본
     */
    public ArrayList<FileItem> getAllFiles() {
        // TODO: 구현할 메소드
        // ArrayList 복사본을 반환 (데이터 무결성 보호)
        return null;
    }
    
    /**
     * .txt 파일에서 기존 데이터를 불러오는 메소드
     * 프로그램 시작 시 자동 호출됨
     */
    private void loadFromFile() {
        // TODO: 구현할 메소드
        // 1. configFilePath의 파일 존재 확인
        // 2. Scanner로 파일 한 줄씩 읽기
        // 3. toString() 형식에 맞춰 split("\\|")으로 파싱
        // 4. 각 줄에서 FileItem 객체 생성
        // 5. addFile()로 목록에 추가
    }
    
    /**
     * 현재 목록의 데이터를 .txt 파일에 저장하는 메소드
     * 파일 추가/삭제 시 자동 호출됨
     */
    private void saveToFile() {
        // TODO: 구현할 메소드
        // 1. PrintWriter로 configFilePath 파일 열기
        // 2. fileList의 각 FileItem에 대해
        // 3. toString() 형식으로 한 줄씩 기록
        // 4. 파일 닫기
    }
}
