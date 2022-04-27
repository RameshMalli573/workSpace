package sample

class User {
	 static void main(String[] args) {
		 File file = new File("sampleFile.txt")
		 file.eachLine { 
			 line -> println "$line"
		 }
	}
}
