# Class that loads and updates an SMList

import yaml 
import os

import ccache

# load, add, remove
commands = ["l", "a", "r"]


command = input("Please specify a command: ")


while(True):

	if command == "l":


	if command == "a":


	if command == "r":


	if command not in commands:
		print("Please specify a valid command!")
		command = input("Please specify a command: ")


# returns the yaml of the currentusercache
def load(name):
	fileData = open(name, "r")
	return yaml.load(fileData.read())


def save(name, sm):
	fileData = yaml.dump(sm)

	with open(filename, "w+") as textFile:
		textFile.write(fileData)


