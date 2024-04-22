"""
fuzss.py의 역할은 betteranimationscollection, easymagic, easyanvil 등 fuzss님의 모드들 프로젝트 구조를 설정합니다.
fuzss란 사람이 만든 모드들은 프로젝트 구조가 아래와 같습니다:
```
betteranimationscollection
- 1.20.4
- 1.20.1
- 1.19.2
```
그리고 각 버전별 폴더에 `build.gradle`이 들어 있습니다. 그럼 `betteranimationscollection`이 아니라 `betteranimationscollection/1.20.1`을 프로젝트 위치로 잡아야 합니다.
근데 그럼 프로젝트 폴더 이름이 다 1.20.1이라고 겹쳐서 전부 심볼릭 링크를 만들어 오류를 피합니다.
(betteranimationscollection/betteranimationscollection -> betteranimationscollection/1.20.1)
"""
import subprocess
import os

targets =[
"betteranimationscollection",
"blockrunner",
"cutthrough",
"easyanvils",
"easymagic",
"leavesbegone",
"pickupnotifier",
"visualworkbench"
]

for target in targets:
    if not os.path.exists(target + "/" + target):
        subprocess.run(["ln", "-s", "1.20.1", target + "/" + target])
