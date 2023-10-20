extends Node2D

var helloworld

func _ready():
	helloworld = Engine.get_singleton("HelloWorld")
	helloworld.connect("testSignal", self.on_testSignal)
	print(helloworld.getHello())

func on_testSignal(data):
	print("TEST SIGNAL RECEIVED: ", data)
