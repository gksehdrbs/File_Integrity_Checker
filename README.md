# 파일 무결성 검사 시스템 (File Integrity Verification System)

![Java](https://img.shields.io/badge/Java-17+-orange?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)
![Status](https://img.shields.io/badge/Status-Development-blue?style=flat-square)

**팀명**: AXIOM | **프로젝트**: 객체지향언어 실습 프로젝트

## 📋 프로젝트 개요

본 프로젝트는 **PC 데이터의 신뢰성을 보장하기 위한 Java 기반 파일 무결성 검증 시스템**입니다. 파일의 고유한 해시값을 비교 분석하여 비인가 파일 수정, 악성코드에 의한 데이터 변조, 시스템 오류로 인한 파일 손상 등을 사전에 탐지합니다.

### 🎯 프로젝트 목표

- **데이터 무결성 보장**: SHA-256 해시 알고리즘을 통한 파일 변조 탐지
- **객체지향 설계**: 클래스 간 독립성을 확보한 유지보수 용이한 구조
- **사용자 친화적 UI/UX**: GUI 기반의 직관적 인터페이스 제공
- **데이터 지속성**: 프로그램 재실행 시에도 등록된 파일 정보 유지

---

## 👥 팀 구성

| 이름 | 학번 | 역할 | 담당 |
|------|------|------|------|
| 한동균 | 2171066 | 팀장 | 시스템 설계 및 총괄 |
| 서효리 | 2394046 | 팀원 | 검증 및 핸들링 |
| 이인화 | 2394047 | 팀원 | GUI 인터페이스 개발 |
| 박주현 | 2594005 | 팀원 | 해시 엔진 개발 |
| 이연주 | 2594104 | 팀원 | 데이터 관리 시스템 |

---

## 🏗️ 시스템 구조

```
Main (애플리케이션 진입점)
 ├─ FileManager (초기화 및 데이터 로드)
 │    └─ FileItem (목록 관리)
 └─ MainFrame (GUI 실행)
      ├─ FileManager (파일 등록/삭제 요청)
      ├─ IntegrityChecker (검증 요청)
      │    ├─ HashEngine (해시 계산)
      │    └─ FileItem (저장 해시값 비교)
      └─ JOptionPane (결과 팝업 출력)
```

---

## 📁 클래스 설계

### Core Classes

| 클래스명 | 담당 | 설명 |
|---------|------|------|
| **FileItem** | 한동균 | 파일 경로, 저장된 해시값, 무결성 상태를 저장하는 데이터 모델 |
| **HashEngine** | 박주현 | SHA-256 알고리즘으로 파일 해시값 생성 |
| **FileManager** | 이연주 | FileItem 목록 관리 및 .txt 파일로 데이터 저장/로드 |
| **IntegrityChecker** | 서효리 | 현재 해시값 계산 및 저장값 비교를 통한 무결성 판별 |
| **MainFrame** | 이인화 | JFrame 기반 GUI 메인 윈도우 |
| **Main** | 한동균 | 애플리케이션 진입점 |

### 주요 기능

#### HashEngine
- `calculateHash(String filePath)`: SHA-256 해시값 계산
- MessageDigest를 사용한 암호화 해시
- BufferedInputStream으로 대용량 파일 효율적 처리

#### FileManager
- `addFile(FileItem fileItem)`: 파일 목록에 등록
- `removeFile(String filePath)`: 파일 목록에서 삭제
- `getFile(String filePath)`: 파일 경로로 FileItem 조회
- `getAllFiles()`: 전체 파일 목록 조회
- `loadFromFile()`: .txt 파일에서 데이터 로드
- `saveToFile()`: 현재 목록을 .txt 파일에 저장

#### IntegrityChecker
- `checkIntegrity(FileItem fileItem)`: 단일 파일 무결성 검증
- `checkAllIntegrity(FileItem[] fileList)`: 전체 파일 검증
- 검증 상태: "정상", "변조됨", "파일없음", "오류"

#### MainFrame
- JList로 파일 목록 시각화
- JFileChooser를 통한 파일 선택
- 버튼 이벤트 처리
- JOptionPane으로 결과 팝업 표시

---

## 🔧 기술 스택

| 분야 | 기술 |
|------|------|
| **Language** | Java (JDK 17 이상) |
| **GUI Library** | Java Swing |
| **Cryptography** | SHA-256 (MessageDigest) |
| **Data Structure** | ArrayList, HashMap |
| **File I/O** | Scanner, PrintWriter, BufferedInputStream |
| **IDE** | VS Code, Cursor AI |
| **Version Control** | Git / GitHub |

---

## 💾 개발 환경

- **OS**: Windows 10/11, macOS (JVM 기반 크로스 플랫폼)
- **Java Version**: JDK 17 이상
- **IDE**: VS Code + Java Extension Pack 또는 Cursor AI
- **Build Tool**: Gradle (선택사항)

---

## 🚀 설치 및 실행

### 1. 프로젝트 클론
```bash
git clone https://github.com/yourusername/file-integrity-checker.git
cd file-integrity-checker
```

### 2. 컴파일
```bash
javac *.java
```

### 3. 실행
```bash
java Main
```

### 실행 결과
```
파일 무결성 검사 시스템이 시작되었습니다.
[GUI 창 실행]
```

---

## 📊 프로젝트 구조

```
file-integrity-checker/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Main.java                    # 애플리케이션 진입점
│   │   │   ├── FileItem.java                # 파일 정보 데이터 모델
│   │   │   ├── HashEngine.java              # SHA-256 해시 계산
│   │   │   ├── FileManager.java             # 파일 목록 관리 및 저장/로드 (개발중)
│   │   │   ├── IntegrityChecker.java        # 무결성 검증 로직
│   │   │   └── MainFrame.java               # GUI 인터페이스
│   │   └── resources/
│   │       └── (리소스 파일 위치)
│   │
│   └── test/
│       └── java/
│           └── (단위 테스트 클래스)
│
├── .gitignore                               # Git 무시 파일 목록
├── README.md                                # 프로젝트 설명
└── fileData.txt                             # 등록된 파일 정보 저장 (런타임 생성)
```

### 디렉토리 설명

| 경로 | 설명 |
|------|------|
| `src/main/java/` | 메인 소스 코드 디렉토리 (모든 .java 클래스 파일) |
| `src/main/resources/` | 리소스 파일 (설정, 메시지, 이미지 등) |
| `src/test/java/` | 단위 테스트 코드 디렉토리 |
| `.gitignore` | Git 버전 관리에서 제외할 파일 목록 |
| `fileData.txt` | 프로그램 실행 시 생성되는 데이터 저장 파일 |

---

## ✨ 주요 특징

### 1. 객체지향 설계
- **높은 응집도**: 각 클래스는 단일 책임을 수행
- **낮은 결합도**: 클래스 간 독립성으로 유지보수 용이
- **확장성**: 새로운 해시 알고리즘 추가 가능

### 2. 효율적인 데이터 관리
- HashMap을 활용한 O(1) 파일 조회
- BufferedInputStream으로 대용량 파일 처리
- .txt 파일 기반의 데이터 영속성

### 3. 사용자 친화적 인터페이스
- 직관적인 GUI 기반 메뉴
- JFileChooser로 간편한 파일 선택
- 명확한 검증 결과 팝업 알림

---

## 🔐 보안 고려사항

- **SHA-256 해시**: 국제 표준 암호화 알고리즘 사용
- **파일 접근 권한**: FileNotFoundException 처리
- **데이터 검증**: 저장된 해시값과 현재 해시값 비교

---

## 📝 데이터 저장 형식

### fileData.txt
```
파일명|절대경로|저장된해시값
report.docx|C:\Users\Documents\report.docx|a1b2c3d4...
system.exe|C:\Windows\system.exe|e5f6g7h8...
```

---

## 🐛 알려진 제한사항

- 현재 SHA-256 알고리즘만 지원 (향후 MD5, SHA-512 추가 예정)
- GUI는 단일 파일 선택만 지원
- 네트워크 드라이브 파일 지원 미정

---

**마지막 업데이트**: 2026년 5월 12일  
**프로젝트 상태**: 개발 진행중 🔨

