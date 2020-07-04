var myVueapp = new Vue({
    el:"#content"
    ,data:{
        datalist:[{id:1, color:"white"}]
    }
    ,methods:{
        // 1�s�ǉ�
        addList:function(){
            this.datalist.push({id:this.datalist.length+1, color:'white'});
        }
        // POST���� datalist�����̂܂ܓ�����
        ,postlist:function(){
            $.ajax({url:'/post'
                ,type:"post"
                ,data:JSON.stringify(this.datalist)
                ,contentType: 'application/json'});
        }
        // GET���� �󂯎����JSON�����̂܂�datalist�ɓ����
        ,getlist:function(){
            var self=this;
            $.get('/get'
            ,null
            ,function(data){self.datalist=data}
            );
        }
    }
})