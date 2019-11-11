# A class which is simply used to store a few objects that get loaded and translated from YAML

url = ""
urlNick = ""
currentIndex = []
diff = [] 


# return the objects without global reach


def getUrl():
	return url


def getNick():
	return urlNick


def getCurrentIndex():
	return currentIndex


def getDiff():
	return diff


# set/update the vairables without global class reach

def setUrl(u):
	url = u


def setUrlNick(un):
	urlNick = un


def setCurrentIndex(i):
	currentIndex = i


def setDiff(d):
	diff = d
