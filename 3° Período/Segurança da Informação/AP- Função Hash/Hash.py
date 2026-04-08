import hashlib
aspas = '"'

def validar_opcao(opcao):
    if opcao == 1:
        tornar_hash()
    elif opcao == 2:
        validar_hash()

def tornar_hash():
    arquivo = input("Digite o caminho do arquivo: ")
    if aspas in arquivo:
        arquivo = arquivo.replace(aspas, "")
    arquivo_aberto = open(arquivo, "rb")
    arquivo_bin = arquivo_aberto.read()
    arquivo_aberto.close()
    while True:
        print("md5 | sha1 | sha224 | sha256 | sha384 | sha512 | sha3_224 | sha3_256 | sha3_384 | sha3_512")
        tipo_hash = input("Qual algoritmo hash você quer? ")
        try:
            x = hashlib.new(tipo_hash)
            x.update(arquivo_bin)
            x = x.hexdigest()
            print(x)
            return x
        except ValueError:
            print("Hash não existe.")
            

def validar_hash():
    input_hash = input("Qual o hash? ")
    x = tornar_hash()
    if x == input_hash:
        print("São hashes iguais!")
    else:
        print("Não são hashes iguais!")


while True:
    opcao = int(input("1- Transformar em hash\n2- Validar hash\nEscolha: "))
    validar_opcao(opcao)
