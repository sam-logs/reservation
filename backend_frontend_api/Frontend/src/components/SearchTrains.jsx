import { data } from "autoprefixer";
import axios from "axios";
import React from "react";
import { useEffect } from "react";
import { useState } from "react";
import DataTable from "react-data-table-component";
import { getTrain } from "./About";

const SearchTrains = () => {
  const [trains, setTrains] = useState([]);

  const getTrains = async () => {
    try {
      // const response=getTrain();
      const response = await axios.get("http://localhost:8080/train/from/pune/to/goa");
      // let data2=localStorage.getItem("data",JSON.stringify(data));
      // console.log(data2);
      setTrains(response.data);
    } catch (error) {
      console.log(error);
    }
  };

  const columns = [
    {
      name: "Name",
      selector: (row) => row.tName,
    },
    {
      name: "Train Number",
      selector: (row) => row.tNumber,
    },
    {
      name: "Distance",
      selector: (row) => row.distance,
    },
    {
      name: "Departure Time",
      selector: (row) => row.sTime,
    },
    {
      name: "Arrival Time",
      selector: (row) => row.eTime,
    },
    {
      name: "Departure Station",
      selector: (row) => row.departureS,
    },
    {
      name: "Arrival Station",
      selector: (row) => row.arrivalS,
    },
    {
      name:"Action",
      cell: (row) => (<button className="btn btn-primary" onClick={() => alert(row.tNumber)}>BOOK</button>),
    }
  ];
  useEffect(() => {
    getTrains();
  }, []);

  return (
    <DataTable
      // title="List of Trains"
      columns={columns}
      data={trains}
      pagination
      fixedHeader
      fixedHeaderScrollHeight="550px"
      highlightOnHover
    />
  );
};

export default SearchTrains;
