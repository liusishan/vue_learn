new Vue({
    el: "#app",
    data: {
        user: {
            id: "",
            username: "",
            password: "",
            age: "",
            sex: "",
            email: ""
        },
        userList: []
    },
    methods: {
        findAll: function () {
            // 在当前方法中定义一个变量，表明是vue对象
            var _this = this;
            axios.get('/day01_vuedemo/user/findAll.do')
                .then(function (response) {
                    _this.userList = response.data; // 响应数据给userLis赋值
                })
                .catch(function (error) {
                    console.log(error);
                })

        },
        findById:function (userId) {
            // 在当前方法中定义一个变量，表明是vue对象
            var _this = this;
            axios.get('/day01_vuedemo/user/findById.do',
                {
                    params:{
                        id: userId
                    }
                })
                .then(function (response) {
                    _this.user = response.data; // 响应数据给user赋值
                    $("#myModal").modal("show");
                })
                .catch(function (error) {
                    console.log(error);
                })
        },
        update:function(user){ // post请求
            var _this = this;
            axios.post('/day01_vuedemo/user/updateUser.do', _this.user)
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                });

        }
    },
    created () { // 当我们页面加载的时候触发请求，查询所有
        this.findAll();
    }
});