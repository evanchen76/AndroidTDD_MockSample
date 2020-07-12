class MockEmailUtil :IEmailUtil{

    // receiveEmail, to store receiveEmail from sendCustomer
    var receiveEmail:String? = null

    override fun sendCustomer(email: String) {
        receiveEmail = email
    }
}
