# 🚀 GitHub에 프로젝트 올리기 (완초자용)

## 📋 **1단계: GitHub 계정 생성**

1. https://github.com 접속
2. **Sign up** 클릭
3. 이메일, 비밀번호, 사용자명 입력 후 계정 생성
4. 이메일 인증 완료

---

## 📋 **2단계: Git 설치 확인**

PowerShell에서 실행:
```powershell
git --version
```

**없으면** → https://git-scm.com/download/win 에서 다운로드 후 설치

---

## 📋 **3단계: Git 설정**

PowerShell에서 실행 (처음 한 번만):
```powershell
git config --global user.name "한동균"
git config --global user.email "your-email@example.com"
```

---

## 📋 **4단계: GitHub에 새 Repository 만들기**

1. GitHub 로그인 후 우측 상단 **`+`** → **`New repository`** 클릭
2. **Repository name**: `file-integrity-checker` 입력
3. **Description**: `Java based file integrity verification system`
4. **Public** 선택 (팀원들이 볼 수 있게)
5. **Add a README file** 체크 해제 (이미 있음)
6. **Create repository** 클릭

→ 생성 후 나오는 HTTPS 링크 복사해두기 (예: `https://github.com/username/file-integrity-checker.git`)

---

## 📋 **5단계: 로컬 폴더를 Git 저장소로 초기화**

PowerShell에서 프로젝트 폴더로 이동:
```powershell
cd c:\Users\gkseh\hansung\JAVA_PZ

# Git 초기화
git init

# 모든 파일 추가
git add .

# 첫 번째 커밋
git commit -m "Initial commit: 파일 무결성 검사 시스템 프로젝트 구조 설정"
```

---

## 📋 **6단계: GitHub에 업로드 (Push)**

```powershell
# 원격 저장소 연결 (위에서 복사한 링크 사용)
git remote add origin https://github.com/your-username/file-integrity-checker.git

# GitHub의 main 브랜치에 업로드
git branch -M main
git push -u origin main
```

**처음 실행 시 로그인 창이 나옵니다** → GitHub 계정 정보 입력

---

## 📋 **7단계: 팀원 초대하기**

1. GitHub Repository 페이지 접속
2. **Settings** 탭 클릭
3. 좌측 **Collaborators** 선택
4. **Add people** 클릭
5. 팀원 GitHub username 입력 후 초대
6. 팀원이 초대 수락 → 협업 가능!

---

## 📚 팀원들이 프로젝트 다운로드하는 방법

```powershell
# 어느 폴더든 실행
git clone https://github.com/your-username/file-integrity-checker.git
cd file-integrity-checker
```

---

## 💾 이후 수정사항 업로드 (자주 할 일)

```powershell
# 1. 변경사항 확인
git status

# 2. 변경 사항 추가
git add .

# 3. 커밋 (변경 내용 기록)
git commit -m "기능 추가: HashEngine 해시 계산 구현"

# 4. 업로드
git push
```

---

## 🔗 요약

| 단계 | 명령어 | 설명 |
|------|--------|------|
| 1 | `git init` | 로컬 저장소 초기화 |
| 2 | `git add .` | 모든 파일 추가 |
| 3 | `git commit -m "메시지"` | 변경사항 커밋 |
| 4 | `git remote add origin <URL>` | 원격 저장소 연결 |
| 5 | `git push -u origin main` | GitHub에 업로드 |

---

**이해 안 되는 부분 있으면 말씀해주세요!** 😊
