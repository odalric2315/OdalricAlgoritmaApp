fun main(args: Array<String>){
        print("Masukkan Nilai Akademi Anda: ")
        val nilai: Int = readLine()?.toInt()!!
        var grade: String = ""

        if (nilai >= 85) grade = "A+"
        else if (nilai >= 80) grade = "A"
        else if (nilai >= 75) grade = "B+"
        else if (nilai >= 70) grade = "B"
        else if (nilai >= 65) grade = "C+"
        else if (nilai >= 60) grade = "C"
        else if (nilai >= 50) grade = "D"
        else if (nilai >= 40) grade = "E"
        else grade = "F"

    println("Selamat Nilai Kamu: $grade")

    if (nilai >= 60){
        println("Selamat, Anda Lulus Nilai Akademi Ini!")
    }

    }