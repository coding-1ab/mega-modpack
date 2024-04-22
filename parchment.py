import os
import subprocess

root = "/home/tmvkrpxl0/mc/1.20.1/mods"

for dir in os.listdir():
    if os.path.exists(dir + "/.git"):
        remote = str(subprocess.check_output(["git", "remote", "-v"], cwd=root + "/" + dir)).split("\n")[0].split(" ")[0][10:]
        if remote != "":
            print(remote)
            subprocess.run(["git", "submodule", "add", remote, dir])