# Just a basic mock-up of how files can bre read and sent around to servers

import socket

host = 'localhost'
port = 7990

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
s.connect((host, port))

f = open("testFile.txt", "rb")

print("Sending data")

l = f.read()

for line in l:
	s.send(line)

f.close()
s.close()
