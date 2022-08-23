import pandas as pd
datos = pd.read_csv('presenciaredes.csv',header=0)
#Leer archivo csv
print("\n Leer archivo .csv \n")
print(datos)

#Transformacion de variables
datos['ENERO'] = datos['ENERO'].astype(float)
datos['FEBRERO'] = datos['FEBRERO'].astype(float)
datos['MARZO'] = datos['MARZO'].astype(float)
datos['ABRIL'] = datos['ABRIL'].astype(float)
datos['MAYO'] = datos['MAYO'].astype(float)
datos['JUNIO'] = datos['JUNIO'].astype(float)
datos['JULIO'] = datos['JULIO'].astype(float)
datos['AGOSTO'] = datos['AGOSTO'].astype(float)
datos['SEPTIEMBRE'] = datos['SEPTIEMBRE'].astype(float)
datos['OCTUBRE'] = datos['OCTUBRE'].astype(float)
datos['NOVIEMBRE'] = datos['NOVIEMBRE'].astype(float)
datos['DICIEMBRE'] = datos['DICIEMBRE'].astype(float)

#Diferencia de seguidores de Twitter de enero y junio

print("\n Diferencia Seguidores de Twitter de Enero y Junio \n")
seguidores = datos.loc[[7],['RED SOCIAL','CONCEPTO','ENERO','JUNIO']]
print(seguidores)

#Promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio

print("\n Promedio de crecimiento de Twitter y Facebook entre los meses de Enero a Junio \n")
crecimiento = datos.loc[[1,8],['RED SOCIAL','CONCEPTO','ENERO','FEBRERO','MARZO','ABRIL','MAYO','JUNIO']]
print(crecimiento)