var imgArr=["images/s1.jpg","images/s2.jpg","images/s3.jpg","images/s4.jpg","images/s5.jpg",];
            var index=0;
            function moveSlider()
            {
                var image=document.getElementById("img1");
                image.src=imgArr[index];
                index++;
                if(index==imgArr.length)
                    {
                        index=0;
                    }
                window.setTimeout("moveSlider()",15000);
            }