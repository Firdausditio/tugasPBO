<?php
    function hitungGaji($gol, $masaKerja){
 	if ($gol == "A"){
  		if ($masaKerja < 10) {
 			$gaji = 5000000;
  		} else {
  			$gaji = 7000000;
  		}
 	} else if ($gol == "B"){
 			if ($masaKerja < 10) {
 				$gaji = 6000000;
  			} else {
  				$gaji = 8000000;
  			}
  		}
return $gaji;
}
echo "Besarnya gaji dari golongan B dengan masa kerja 8 tahun adalah Rp.".hitungGaji("B", 8);

?>