$(function(){
    $('form[name="form1"]').submit(function() {
        let user_id = $('input[name="user_id"]').val();
        let user_pw = $('input[name="user_pw"]').val();
    
        if(!user_id){
            alert("아이디를 입력하세요");   
            $('input[name=user_id]').focus();
            return false;
        }
        if(!user_pw){
            alert("비밀번호를 입력하세요");
            $('input[name=user_pw]').focus();
            return false;
        }

        
        if(!$('input[name="gender"]').is(':checked')){
            alert("성별을 입력해주세요");
            $('input[name="gender"]:eq(1)').attr('checked', true);
        }
    
        let email = $('input[name="email"]').val();
        if(!email){
            alert("이메일을 입력하세요");
            $('input[name=email]').focus();
            return false;
        }

        let url = $('input[name="url"]').val();
        if(!url){
            alert("URL을 입력하세요");
            $('input[name=url]').focus();
            return false;
        }

        let phone = $('input[name="phone"]').val();
        if(!phone){
            alert("핸드폰 번호를 입력하세요");
            $('input[name=phone]').focus();
            return false;
        }

        let hobby = $('input[name="hobby"]').val();
        if(!$('input[name="hobby"]').is(':checked')){
            alert("취미를 선택하세요");
            $('input[name="hobby"]:eq(1)').attr('checked', true);
        }
        
        //0은 선택하세요
        if($('select[name="job"] > option:selected').index() == 0){
            alert("직업을 선택하세요");
            $('select[name="job"] > option:eq(1)').attr('selected', true);
            return false;
        }

        let gender = $('input[name="gender"]:checked').val();
         hobby = $('input[name="hobby"]').val();
        let job = $('input[name="job"]').val();

        return false;
    });
});