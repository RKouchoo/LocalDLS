import csv

csvFile = open("names.csv")
csvReader = csv.reader(csvFile)
csvList = list(csvReader)

for x in csvList:
	print(x)

