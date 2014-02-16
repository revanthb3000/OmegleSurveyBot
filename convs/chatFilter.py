import os
fp = open("HappyBirthday.html", "w")
fp.write("<html><title>Happy Birthday !!</title><div><table>")
for fileName in os.listdir(os.getcwd()):
    if(".txt" in fileName):
        f = open(fileName, "r")
        matter = f.read()
        f.close()
        if("Stranger:" in matter):
            matter = matter.replace("\n","<br/>")
            matter = matter[0:matter.find("Stranger has disconnected.")]
            matter = matter[0:matter.find("You have disconnected.")]
            fp.write("<td><tr><p style=\"color:black;margin-left:20px;font-size:25px\">" + matter.replace("You:","<font color='blue'>You:</font>").replace("Stranger:","<font color='red'>Stranger:</font>") + "</p></td></tr>")
        fp.write("<br/><br/>")

fp.write("</table></div></html>")
fp.close()
