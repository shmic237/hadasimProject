import math


def rectangular_tower(height, width):
    if height == width or abs(height - width) > 5:
        area = height * width
        print('The area of the rectangle is:', area)
    else:
        permieter = 2 * (height + width)
        print('The permieter of the rectangle is:', permieter)


def triangle_tower(height, width, triangle_action):
    if triangle_action > 2:
        print('Eror: Please select one of the 3 options')
        exit()
    if triangle_action == 1:
        permieter = math.sqrt(height ** 2 + (width // 2) ** 2) * 2 + width
        print('The perimeter of the triangle is:', permieter)
    elif triangle_action == 2:
        if width % 2 == 0 or width > height * 2:
            print('The triangle cannot be printed')
            print('if you want the triangle to be printed \nchoose an odd width or the length will be less than 2 times the height...')
        else:
            num_of_levels = int((width / 2) - 1) #How many odd numbers are there and this will be the number of levels, except for the first and last level
            num_for_each_level = int(((height - 2)/num_of_levels) + 1) #Calculate how many levels there will be from each odd number
            num_of_remainder = (height - 2) % num_of_levels #Calculating the balance from the division and adding it to number 3
            spaces = num_of_levels + 1 #number of spaces
            print((spaces*" "+"*")) #Print the first line
            spaces -= 1
            for h in range(int(num_of_remainder)): #print the balance to number 3
                print((spaces * " ")+"***")
            for i in range(3, width - 1, 2): #Print the rest of the levels
                for j in range(1, num_for_each_level):
                    print((spaces * " ")+i * "*")
                spaces = spaces - 1

            print(width * "*") #Print the last line       
    
       
        



if __name__ == '__main__':
    
    select = 0

    while select != 3:
        select = int(input('Please enter which type of shape you want: \n 1- Rectangle \n 2- Triangle \n For exit press 3 \n'))
        if select > 3:
            print('Eror: Please select one of the 3 options')
            exit()
        if select == 3:
            exit()
        height = int(input('Please enter the height: \n'))
        if height < 2 and select == 1:
            print("Error: The height must at least 2")
            exit()
        width = int(input('Please enter the width: \n'))
        if select == 1:
            rectangular_tower(height, width)
        if select == 2:
            triangle_action = int(input('Which kind of action do you want? \n 1 - Perimeter calculation \n 2- Printing of the shape \n'))
            triangle_tower(height, width, triangle_action)
       
    