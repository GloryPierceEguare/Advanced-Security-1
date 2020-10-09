from tkinter import *

# Initiate tkinter frame
root = Tk()

# Title of the tkinter frame
root.title('Calculator')

# Entry Box at the beginning
statement = ""


# Function to do the maths calculation in the Entry Box
def result():
    global statement
    ans = eval(statement)
    txt.delete(0, END)
    txt.insert(0, ans)


# Function to clear the Entry Box
def clear():
    global statement
    statement = ""
    txt.delete(0, END)


# Function to add to the Entry Box
def state(x):
    global statement
    statement = statement + x
    txt.delete(0, END)
    txt.insert(0, statement)


# Initiate variables and buttons
txt = Entry(root, text="", font="8")
txt.grid(row=0, column=0, padx="40", pady="10", columnspan=5, ipadx=80, ipady=8)
button_1 = Button(root, text="1", padx="40", pady="20", command=lambda: state("1")).grid(row=4, column=0)
button_2 = Button(root, text="2", padx="40", pady="20", command=lambda: state("2")).grid(row=4, column=1)
button_3 = Button(root, text="3", padx="40", pady="20", command=lambda: state("3")).grid(row=4, column=2)
button_4 = Button(root, text="4", padx="40", pady="20", command=lambda: state("4")).grid(row=3, column=0)
button_5 = Button(root, text="5", padx="40", pady="20", command=lambda: state("5")).grid(row=3, column=1)
button_6 = Button(root, text="6", padx="40", pady="20", command=lambda: state("6")).grid(row=3, column=2)
button_7 = Button(root, text="7", padx="40", pady="20", command=lambda: state("7")).grid(row=2, column=0)
button_8 = Button(root, text="8", padx="40", pady="20", command=lambda: state("8")).grid(row=2, column=1)
button_9 = Button(root, text="9", padx="40", pady="20", command=lambda: state("9")).grid(row=2, column=2)
button_0 = Button(root, text="0", padx="40", pady="20", command=lambda: state("0")).grid(row=5, column=1)
button_add = Button(root, text="+", padx="40", pady="20", command=lambda: state("+")).grid(row=5, column=4)
button_sub = Button(root, text="-", padx="40", pady="20", command=lambda: state("-")).grid(row=4, column=4)
button_mul = Button(root, text="*", padx="40", pady="20", command=lambda: state("*")).grid(row=3, column=4)
button_div = Button(root, text="/", padx="40", pady="20", command=lambda: state("/")).grid(row=2, column=4)
button_equal = Button(root, text="=", bg='green', fg='white', padx="40", pady="20", command=result).grid(row=1,
                                                                                                         column=4)
button_clear = Button(root, text="CLEAR", bg='red', fg='white', padx="40", pady="20", command=clear, width=30).grid(
    row=1, column=0, columnspan=3)

# Loop to keep the calculator running
root.mainloop()
