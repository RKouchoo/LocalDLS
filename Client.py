# client side server for recieveing data

import socket

host = 'localhost'
port = 7990

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
s.connect((host, port))

s.listen(500)

connection, addr = s.accept()

recvData = []

while connection.recv(1):
	recvData.append(connection.recv(1))

for data in recvData:
	print(data)