import socket
def server(host = 'localhost', port=8082):
    data_payload = 2048 # quantidade maxima de dados que pode ser recebida em bytes
    sock = socket.socket(socket.AF_INET,  socket.SOCK_STREAM) # cria um socket, sendo socket.AF_INET para IPv4 e socket.SOCK_STREAM para TCP
    sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1) # permite que o endereço do servidor possa ser reutilizado imediatamente
    server_address = (host, port) # tupla com o endereço do servidor e a porta
    print ("Starting up echo server  on %s port %s" % server_address)
    sock.bind(server_address) # associa o socket com o endereço do servidor
    sock.listen(5) # habilita o servidor a aceitar conexões, com o argumento 5 sendo o número máximo de conexões pendentes
    i = 0
    while True: 
        print ("Waiting to receive message from client")
        client, address = sock.accept() # aceita a conexão do cliente. O método accept() retorna uma nova tupla com um novo socket e o endereço do cliente
        data = client.recv(data_payload) # recebe os dados do cliente. A quantidade de dados recebidos é limitada pelo data_payload
        if data:
            print ("Data: %s" %data)
            client.send(b'Your data was received') # envia uma mensagem de volta para o cliente
            client.close() # fecha a conexão com o cliente
            i+=1
            if i>=3: break           
server()
