#!/usr/bin/python
import psycopg2
from config import config

def connect():
    """ Connect to the PostgreSQL database server """
    conn = None

    try:
        # read connection parameters
        params = config()

        # connect to the PostgreSQL server
        conn = psycopg2.connect(**params)

        conn.autocommit = True
		
        # create a cursor
        cur = conn.cursor()

        #abrir arquivo com as querys de criação do banco
        with open('bd_hospital.sql') as file_object:
            contents = file_object.read()
        
        cur.execute(contents)
       
	# close the communication with the PostgreSQL
        cur.close()
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if conn is not None:
            conn.close()
            print('Database connection closed.')


if __name__ == '__main__':
    connect()
