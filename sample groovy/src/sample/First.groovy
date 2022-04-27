package sample

class First {
	static void main(String[] arg) {
		def lst = 1..10
		println(lst.contains(10))
		println(lst.contains(11))
		println(lst.get(0))
	}
}
