package org.cream.kotlin


fun main() {

    // readLine은 한줄 전체를 읽는 메소드로 split메소드가 그것을 쪼개는 역활을 함
    val d = readLine()!!.split(" ").toString()

    println(d)
}


    // 프로그먼트에서 프로그먼트로 천이할떄 파라미터 값을 데이터를 전송해서 받는 것 
    /*companion object {
        private const val KEY_PARAM = "KEY_PARAM"

        fun newInstance(keyParam: XXX): XXFragment {
            val fragment = XXFragment()
            val args = Bundle()
            args.putString(KEY_PARAM, keyParam)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val keyParam = arguments.getString(KEY_PARAM)
    }*/

