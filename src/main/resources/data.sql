DROP TABLE IF EXISTS  LA_TRAFFIC;

CREATE TYPE Move AS ENUM ('Arrival', 'Departure');
CREATE TYPE FlightType AS ENUM ('Domestic', 'International');

CREATE TABLE LA_TRAFFIC(
   DATA_EXTRACT_DATE VARCHAR(50) NOT NULL,
   REPORT_PERIOD VARCHAR(50) NOT NULL,
   TERMINAL VARCHAR(50) NOT NULL,
   ARRIVAL_DEPARTURE Move NOT NULL,
   DOMESTIC_INTERNATIONAL FlightType NOT NULL,
   PASSENGER_COUNT INT(55)
   )
   AS
   SELECT *
   FROM CSVREAD('./data/los-angeles-international-airport-passenger-traffic-by-terminal.csv');

 ALTER TABLE LA_TRAFFIC ADD id INT AUTO_INCREMENT  PRIMARY KEY FIRST;