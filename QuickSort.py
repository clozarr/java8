def particion(array, low, high):
    i = (low - 1)
    pivot = array[high]

    for j in range(low, high):
        if array[j] <= pivot:
           i = i + 1
           array[i],array[j] = array[j], array[i]

    array[i +1], array[high] = array[high], array[i + 1]
    return (i + 1)


def quickSort(arr, low, high):
    if low < high:
       pi = particion(arr, low, high)
       quickSort(arr, low, pi-1)
       quickSort(arr, pi+1, high)


array = [1992, 1990, 10, 5, 6, 100, 0, -1, 12]
longitud = len(array)
quickSort(array,0,longitud-1)
print("Array ordenado: ")
for i in range(longitud):
    print("%d" %array[i]),