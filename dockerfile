From devopsedu/webapp
Maintainer "Cinly"
RUN apt-get update && apt-get -y upgrade && DEBIAN_FRONTEND=noninteractive apt-get -y install \
    apache2 php7.0 php7.0-mysql libapache2-mod-php7.0 curl elinks
RUN rm -rf /var/www/html/*
ADD website /var/www/html
Expose 80
CMD /usr/sbin/apache2ctl -D FOREGROUND
