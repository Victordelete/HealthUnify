#!/usr/bin/python
from configparser import ConfigParser
import os

#Funcao que configura os parametros de entrada no banco de dados
def config(filename=os.path.dirname(os.path.dirname(os.path.abspath(__file__))) +'\modelo_dados\database.ini',
            section='postgresql'):
    # cria um parser
    parser = ConfigParser()
    # read config file
    parser.read(filename)

    # get parametros de iniciacao
    db = {}
    if parser.has_section(section):
        params = parser.items(section)
        for param in params:
            db[param[0]] = param[1]
    else:
        raise Exception('Section {0} not found in the {1} file'.format(section, filename))

    return db