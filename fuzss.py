import subprocess

targets =[
"betteranimationscollection"
"blockrunner"
"cutthrough"
"easyanvils"
"easymagic"
"leavesbegone"
"pickupnotifier"
"visualworkbench"
]

for target in targets:
    subprocess.run(["ln", "-s", target + "/" + target, target + "/1.20.1"])
