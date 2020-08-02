select * 
  from kyuyo
  inner join kintai 
  on kyuyo.kintai_cd = kintai.kintai_cd
 where kintai.user_id = /* userId */''
   and kintai.taisho_y = /* taishoY */2020
