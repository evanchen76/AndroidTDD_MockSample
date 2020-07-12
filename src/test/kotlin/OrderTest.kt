import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class OrderTest {

    @Test
    fun insertOrder() {

        val order = Order()
        val mockEmailUtil = MockEmailUtil()

        val userEmail = "someMail@gmail.com"
        order.insertOrder(userEmail, 1, 200, mockEmailUtil)

        //Use mockEmail.Util.receiveEmail to check is email correct.
        Assert.assertEquals(userEmail, mockEmailUtil.receiveEmail)

    }
}