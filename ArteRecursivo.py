import turtle

myTurtle = turtle.Turtle()
myWin = turtle.Screen()


def draw(myTurtle, length, angle):
    
    if length > 0:
       myTurtle.forward(length)
       myTurtle.left(angle)

       draw(myTurtle, length - 1, angle)

draw(myTurtle, 25, 60)
draw(myTurtle, 50, 60)
draw(myTurtle, 100, 60)
draw(myTurtle, 150, 60)

#open window
myWin.exitonclick()