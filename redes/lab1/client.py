import socket
def client(host = 'localhost', port=8082): 
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM) # cria um socket, sendo socket.AF_INET para IPv4 e socket.SOCK_STREAM para TCP
    server_address = (host, port) # tupla com o endereço do servidor e a porta
    print ("Connecting to %s port %s" % server_address) 
    sock.connect(server_address) # tenta a conexão do cliente com o servidor
    try: 
        message = input("Please enter your mensage: ") # recebe a mensagem digitada pelo usuário
        print ("Sending %s" % message) 
        sock.sendall(message.encode('utf-8'))  # envia em a mensagem em bytes usandp UTF-8 antes de ser enviada

        data = sock.recv(2048) # recebe a resposta do servidor
        print("Received: %s" % data)
    finally: 
        print("Closing connection to the server") 
        sock.close() 

client()
