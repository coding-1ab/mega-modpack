import os
import subprocess

exceptions = ["ImmediatelyFast"]

def update(project_dir):
    if project_dir not in exceptions:
        subprocess.run(["sed", "-i", "/# Coding lab property start/,/# Coding lab property end/d", project_dir + "/gradle.properties"])
        subprocess.run(["zsh", "-c", "cat common.properties >> " + project_dir + "/gradle.properties"])

for dir in os.listdir():
    if os.path.exists(dir + "/gradle.properties"):
        update(dir)
    elif os.path.exists(dir + "/1.20.1/gradle.properties"):
        update(dir + "/1.20.1")

update(".")
update("cccbridge/forge")
