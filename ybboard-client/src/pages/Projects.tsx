import {useEffect, useState} from "react";
import api from "../services/api";
import type { Project } from "../services/interfaces";


function GetProjects(){
    const [projects, setProjects] = useState<Project[]>([])

    const getProjects = async () => {
        try {
            const response = await api.get<Project[]>('/api/project')
            setProjects(response.data);
        } catch (err){
            console.log("Error on Projects.tsx; line 13: " + err)
        }
    }

    useEffect(() => {
        getProjects()
    }, [])

    return (
        <div className="Projects_List">
            
            {projects && projects.length > 0 ? (
                <div className="All_Projects">
                    <label>All Projects:</label>    
                    <ul>
                        {projects.map((p, idx) => (
                            <li key={p.id ?? idx}>{p.name}</li>
                        ))}
                    </ul>
                </div>
            ) : (
                <label>No projects created yet</label>
            )}
        </div>
    )
}
export default GetProjects;