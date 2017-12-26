

##163G4G

###负责人

马鑫磊

###常用命令:

git clone ****
git commit
git push
git reset --hard <commit_id>:彻底回退到某个版本，本地的源码也会变为上一个版本的内容
git push origin HEAD --force:上传到指定分支:
git reset –mixed：此为默认方式，不带任何参数的git reset，即时这种方式，它回退到某个版本，只保留源码，回退commit和index信息
git reset –soft：回退到某个版本，只回退了commit的信息，不会恢复到index file一级。如果还要提交，直接commit即可
git log:查看commit日志
