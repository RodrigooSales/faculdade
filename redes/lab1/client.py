import socket
def client(host = 'localhost', port=8082): 
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM) 
    server_address = (host, port) 
    print ("Connecting to %s port %s" % server_address) 
    sock.connect(server_address) 
    try: 
        message = "Hello World" 
        print ("Sending %s" % message) 
        sock.sendall(message.encode('utf-8')) 

        data = sock.recv(2048)
        print("Received: %s" % data)
    finally: 
        print("Closing connection to the server") 
        sock.close() 

client()
