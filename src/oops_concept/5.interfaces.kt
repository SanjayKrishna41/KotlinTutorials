package oops_concept

fun main(args : Array<String>){

//    var bank = Bank() //cannot create an instance of interface class
    val sbi = SBI()
    sbi.displayBranchName()
    sbi.displayAge()
    sbi.displayBranchCode()
    sbi.displayIFSC()
    sbi.displayAddress()
}

//Interface
interface Bank{
    val ifsc_code : String      //variables in interface are abstract by default
    val branchCode : String
    fun displayIFSC()           //Normal methods in Interface are public and open not final
    fun displayBranchCode()
}

//Interface
interface Branch{
    val name : String      //variables in interface are abstract by default
    val address : String
    fun displayBranchName()           //Normal methods in Interface are public and open not final
    fun displayAddress()
}

class SBI : Person(),Bank,Branch{
    override val ifsc_code: String = "SBI0004020"
    override val branchCode: String = "SBI001"
    override val age: Int = 100

    override val name: String = "Kuvempu nagara"
    override val address: String  = "Mysore"

    override fun displayIFSC() {
        println("IFSC = $ifsc_code")
    }

    override fun displayBranchCode() {
        println("Branch Code = $branchCode")
    }

    override fun displayAge() {
        println("Age of Bank = $age")
    }

    override fun displayBranchName() {
        println("Branch Name = $name")
    }

    override fun displayAddress() {
        println("Address of Branch = $address")
    }
}