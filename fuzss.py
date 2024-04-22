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
