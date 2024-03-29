# load additional Python modules
import socket
import time

sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
local_hostname = socket.gethostname()
local_fqdn = socket.getfqdn()
ip_address = socket.gethostbyname(local_hostname)

server_address = (ip_address, 1989)
sock.connect(server_address)
print ("connecting to %s (%s) with %s" % (local_hostname, local_fqdn, ip_address))

temperature_data = ["15", "22", "21", "26", "25", "19"]

for entry in temperature_data:
    print ("data: %s" % entry)
    new_data = str("temperature: %s\n" % entry).encode("utf-8")
    sock.sendall(new_data)
    
    # wait for two seconds
    time.sleep(2)

# close connection
sock.close()