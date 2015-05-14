JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Solution2_1.java \
	Main.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class