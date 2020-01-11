from pulp import *
import numpy as np
import time
start = time.time()  # старт таймера
# Количество перевозимого товара
x1 = pulp.LpVariable("x1", lowBound=0)
x2 = pulp.LpVariable("x2", lowBound=0)
x3 = pulp.LpVariable("x3", lowBound=0)
x4 = pulp.LpVariable("x4", lowBound=0)
x5 = pulp.LpVariable("x5", lowBound=0)
x6 = pulp.LpVariable("x6", lowBound=0)
x7 = pulp.LpVariable("x7", lowBound=0)
x8 = pulp.LpVariable("x8", lowBound=0)
x9 = pulp.LpVariable("x9", lowBound=0)
x10 = pulp.LpVariable("x10", lowBound=0)
x11 = pulp.LpVariable("x11", lowBound=0)
x12 = pulp.LpVariable("x12", lowBound=0)
x13 = pulp.LpVariable("x13", lowBound=0)
x14 = pulp.LpVariable("x14", lowBound=0)
x15 = pulp.LpVariable("x15", lowBound=0)
x16 = pulp.LpVariable("x16", lowBound=0)
x17 = pulp.LpVariable("x17", lowBound=0)
x18 = pulp.LpVariable("x18", lowBound=0)
x19 = pulp.LpVariable("x19", lowBound=0)
x20 = pulp.LpVariable("x20", lowBound=0)
x21 = pulp.LpVariable("x21", lowBound=0)
x22 = pulp.LpVariable("x22", lowBound=0)
x23 = pulp.LpVariable("x23", lowBound=0)
x24 = pulp.LpVariable("x24", lowBound=0)
x25 = pulp.LpVariable("x25", lowBound=0)
quantityStock = [70,46,39,41,55] # Количество товара на складе
quantityOrdered = [23,38,30,15,8] # Количество заказанного товара  
# Определение
task = pulp.LpProblem('0',pulp.LpMaximize)
task += (-7*x1 - 1*x2 - 1*x3 - 4*x4 - 2*x5
              -3*x6 - 5*x7 - 6*x8 - 6*x9 - 8*x10 
              -8*x11 - 2*x12 - 4*x13 - 3*x14 - 7*x15 
              -3*x16 - 4*x17 - 2*x18 - 5*x19 - 8*x20 
              -8*x21 - 1*x22 - 4*x23 - 7*x24 - 6*x25), "Функция цели"
        
# Условие
task += x1 + x2 + x3 + x4 + x5 <= quantityStock[0],"1" 
task += x6 + x7 + x8 + x9 + x10 <= quantityStock[1],"2"
task += x11 + x12 + x13 + x14 + x15 <= quantityStock[2],"3"
task += x16 + x17 + x18 + x19 + x20 <= quantityStock[3],"4"
task += x21 + x22 + x23 + x24 + x25 <= quantityStock[4],"5"        
task += x1 + x6 + x11 + x16 + x21 == quantityOrdered[0],"6"
task += x2 + x7 + x12 + x17 + x22 == quantityOrdered[1],"7"
task += x3 + x8 + x13 + x18 + x23 == quantityOrdered[2],"8"
task += x4 + x9 + x14 + x19 + x24 == quantityOrdered[3],"9"
task += x5 + x10 + x15 + x20 + x25 == quantityOrdered[4],"10"
# Решение                    
task.solve()
                    
print ("Результат:")
for variable in task.variables():
    print (variable.name, "=", variable.varValue)
    
print ("Стоимость доставки:")
print (abs(value(task.objective)))
stop = time.time()# стоп таймера
print ("Время :")
print(stop - start)