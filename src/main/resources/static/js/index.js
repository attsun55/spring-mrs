var myVueapp = new Vue({
    el:"#content"
    ,data:{
        datalist:[{id:1, color:"white"}]
    }
    ,methods:{
        // 1s’Ç‰Á
        addList:function(){
            this.datalist.push({id:this.datalist.length+1, color:'white'});
        }
        // POSTˆ— datalist‚ğ‚»‚Ì‚Ü‚Ü“Š‚°‚é
        ,postlist:function(){
            $.ajax({url:'/post'
                ,type:"post"
                ,data:JSON.stringify(this.datalist)
                ,contentType: 'application/json'});
        }
        // GETˆ— ó‚¯æ‚Á‚½JSON‚ğ‚»‚Ì‚Ü‚Üdatalist‚É“ü‚ê‚é
        ,getlist:function(){
            var self=this;
            $.get('/get'
            ,null
            ,function(data){self.datalist=data}
            );
        }
    }
})