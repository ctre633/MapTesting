Map exits = ['North':true, 'South':false, 'East':false, 'West':false]

println exits

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
print "Welcome to room one, where would you like to go?"
def userInput = br.readLine()

def roomEntry = userInput.equals(exits['North', 'South', 'East', 'West'])

if(roomEntry == true){
    println "Welcome to room two."
}else if(roomEntry == false){
    println "There is nothing there."
}

