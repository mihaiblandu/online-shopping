<div class="container">

	<div class="row">

		<div id="map" style="width: 100%; height: 500px"></div>

		<script>
			function myMap() {
				var mapCanvas = document.getElementById("map");
				var myCenter = new google.maps.LatLng(48.2109192, 27.0408656);
				var mapOptions = {
					center : myCenter,
					zoom : 7
				};
				var map = new google.maps.Map(mapCanvas, mapOptions);
				var marker = new google.maps.Marker({
					position : myCenter,
					animation : google.maps.Animation.BOUNCE
				});
				marker.setMap(map);
			}
		</script>

		<script
			src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBgLbdjSv9S7DicVeKLUu86VEoz1T9-gfU&callback=myMap"></script>
	</div>


</div>
